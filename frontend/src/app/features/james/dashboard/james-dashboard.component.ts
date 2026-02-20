import { Component } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';

@Component({
  selector: 'app-james-dashboard',
  standalone: true,
  imports: [MatCardModule, MatIconModule],
  template: `
    <h1>Willkommen im Kundenportal</h1>
    <div class="dashboard-grid">
      <mat-card>
        <mat-card-header>
          <mat-icon mat-card-avatar>description</mat-icon>
          <mat-card-title>Meine Vertraege</mat-card-title>
        </mat-card-header>
        <mat-card-content>
          <p>Uebersicht Ihrer aktiven Vertraege</p>
        </mat-card-content>
      </mat-card>

      <mat-card>
        <mat-card-header>
          <mat-icon mat-card-avatar>event</mat-icon>
          <mat-card-title>Naechste Termine</mat-card-title>
        </mat-card-header>
        <mat-card-content>
          <p>Ihre anstehenden Beratungstermine</p>
        </mat-card-content>
      </mat-card>

      <mat-card>
        <mat-card-header>
          <mat-icon mat-card-avatar>chat</mat-icon>
          <mat-card-title>KI-Assistent</mat-card-title>
        </mat-card-header>
        <mat-card-content>
          <p>Fragen Sie unseren KI-Assistenten</p>
        </mat-card-content>
      </mat-card>

      <mat-card>
        <mat-card-header>
          <mat-icon mat-card-avatar>report_problem</mat-icon>
          <mat-card-title>Schaeden melden</mat-card-title>
        </mat-card-header>
        <mat-card-content>
          <p>Schadenmeldung schnell und einfach</p>
        </mat-card-content>
      </mat-card>
    </div>
  `,
  styles: [`
    .dashboard-grid {
      display: grid;
      grid-template-columns: repeat(auto-fill, minmax(280px, 1fr));
      gap: 24px;
      margin-top: 16px;
    }

    h1 {
      color: #333;
      margin-bottom: 8px;
    }
  `],
})
export class JamesDashboardComponent {}
