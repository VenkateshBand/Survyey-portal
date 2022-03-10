import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListSurveyorComponent } from './list-surveyor.component';

describe('ListSurveyorComponent', () => {
  let component: ListSurveyorComponent;
  let fixture: ComponentFixture<ListSurveyorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListSurveyorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListSurveyorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
