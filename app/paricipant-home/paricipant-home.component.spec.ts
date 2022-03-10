import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ParicipantHomeComponent } from './paricipant-home.component';

describe('ParicipantHomeComponent', () => {
  let component: ParicipantHomeComponent;
  let fixture: ComponentFixture<ParicipantHomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ParicipantHomeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ParicipantHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
