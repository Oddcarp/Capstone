import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, FormBuilder, Validators} from '@angular/forms';
import {HttpClient, HttpParams} from '@angular/common/http';
import {Observable} from 'rxjs'

@Component({
  selector: 'app-molecular-mass-calc',
  templateUrl: './molecular-mass-calc.component.html',
  styleUrls: ['./molecular-mass-calc.component.scss']
})
export class MolecularMassCalcComponent implements OnInit {
  outputString:string;
  problem: any;
  result: any;
  resultType: any;
  problemForm: FormGroup;
  
  readonly ROOT_URL = 'http://localhost:8080/calculator';


  
 solveProblem() {
  // if (this.problemForm.status != 'VALID') {
  //   console.log('form is not valid')
  //   return
   //}
   const data = this.problemForm.value
   console.log(data)

   let params = new HttpParams()
        .set('formula',data.formula)
 
   return this.http.get(this.ROOT_URL,{params}).subscribe(answer => this.updateResult(answer));
 
 }
 
 updateResult(answer) {
  console.log(answer);
  this.result = answer.molecularMassTotal;
  }
 
  constructor(private http: HttpClient, private fb: FormBuilder) { }
 
  ngOnInit() {
    this.problemForm = this.fb.group({
      formula: new FormControl('')
    });
 
  this.problemForm.controls['formula'].valueChanges.subscribe(value => {
    if (value.length > 0) {
      let charArray:string[] = value.split('');
      this.outputString ='';
      let curChar:string = '';
      for (var i = 0 ; i < charArray.length ; i++) {
        curChar = value.charAt(i);
        if (!isNaN(value.charAt(i))) {
          this.outputString += '<sub>' + curChar + '</sub>';
        } else {
          this.outputString += curChar;
        }
      }
    }
  });
    //this.problem.subscribe(problem => {
    //  this.problemForm.patchValue(problem)
    //})
  }
 
  onSubmit() {
    console.log(this.problem);
    console.log('any');
   
  }
 
 
 }
 