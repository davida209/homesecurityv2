import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContraolvidadaComponent } from './contraolvidada.component';

describe('ContraolvidadaComponent', () => {
  let component: ContraolvidadaComponent;
  let fixture: ComponentFixture<ContraolvidadaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContraolvidadaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContraolvidadaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
