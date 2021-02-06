import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup} from "@angular/forms";
import {Router} from "@angular/router";

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.scss']
})
export class HomePageComponent implements OnInit {

  userForm: FormGroup = this.formBuilder.group({
    username: [''],
    password: ['']
  });

  constructor(private formBuilder: FormBuilder, private router: Router) {
  }

  ngOnInit(): void {
  }

  submitUserForm(): void {
    console.log('Submit');
    this.router.navigate(['balance-form']);
  }

}
