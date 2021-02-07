import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {FinAssPayOnAccComponent} from './fin-ass-pay-on-acc.component';

describe('FinAssPayOnAccComponent', () => {
  let component: FinAssPayOnAccComponent;
  let fixture: ComponentFixture<FinAssPayOnAccComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [FinAssPayOnAccComponent]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FinAssPayOnAccComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
