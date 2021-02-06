import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {NonCurrentAssetsComponent} from './non-current-assets.component';

describe('NonCurrentAssetsComponent', () => {
  let component: NonCurrentAssetsComponent;
  let fixture: ComponentFixture<NonCurrentAssetsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [NonCurrentAssetsComponent]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NonCurrentAssetsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
