import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, FormBuilder, Validators} from '@angular/forms';
import {HttpClient, HttpParams} from '@angular/common/http';

@Component({
  selector: 'app-ideal-gas-law-calc',
  templateUrl: './ideal-gas-law-calc.component.html',
  styleUrls: ['./ideal-gas-law-calc.component.scss']
})
export class IdealGasLawCalcComponent implements OnInit {
  problem: any;
 result: any;
 resultType: any;
 problemForm: FormGroup;
 readonly ROOT_URL = 'http://localhost:8080/idealgaslaw';
// pressure = new FormControl('', [Validators.required, Validators.email]);
// volume = new FormControl('', [Validators.required, Validators.email]);
// moles = new FormControl('', [Validators.required, Validators.email]);
// temperature = new FormControl('', [Validators.required, Validators.email]);
solveProblem() {
 // if (this.problemForm.status != 'VALID') {
 //   console.log('form is not valid')
 //   return
  //}
  const data = this.problemForm.value
  console.log(data)
  let params = new HttpParams()
       .set('pressure',data.pressure)
       .set('volume',data.volume)
       .set('moles',data.moles)
       .set('temperature',data.temperature);

  return this.http.get(this.ROOT_URL,{params}).subscribe(answer => this.updateResult(answer));

}

updateResult(answer) {
 console.log(answer);
 this.result = answer.solution;
 this.resultType = answer.solutionType;
 }

 constructor(private http: HttpClient, private fb: FormBuilder) { }

 ngOnInit() {
   this.problemForm = this.fb.group({
     pressure: '',
     volume: '',
     moles: '',
     temperature:''
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

