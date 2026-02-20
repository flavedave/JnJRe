import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatCardModule } from '@angular/material/card';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatIconModule } from '@angular/material/icon';

@Component({
  selector: 'app-jarvis-dashboard',
  standalone: true,
  imports: [CommonModule, MatCardModule, MatGridListModule, MatIconModule],
  template: `
    <h1>Vermittler-Dashboard</h1>
    <mat-grid-list cols="4" rowHeight="180px" gutterSize="24">
      @for (kpi of kpis; track kpi.title) {
        <mat-grid-tile>
          <mat-card class="kpi-card">
            <mat-card-header>
              <mat-icon mat-card-avatar [style.color]="kpi.color">{{ kpi.icon }}</mat-icon>
              <mat-card-title>{{ kpi.value }}</mat-card-title>
              <mat-card-subtitle>{{ kpi.title }}</mat-card-subtitle>
            </mat-card-header>
            <mat-card-content>
              <p class="kpi-trend" [style.color]="kpi.trendColor">{{ kpi.trend }}</p>
            </mat-card-content>
          </mat-card>
        </mat-grid-tile>
      }
    </mat-grid-list>
  `,
  styles: [`
    h1 {
      color: #333;
      margin-bottom: 16px;
    }

    .kpi-card {
      width: 100%;
      height: 100%;
    }

    .kpi-trend {
      font-size: 14px;
      margin-top: 8px;
    }
  `],
})
export class JarvisDashboardComponent {
  kpis = [
    {
      title: 'Umsatz/Termin',
      value: '385 EUR',
      icon: 'euro_symbol',
      color: '#4caf50',
      trend: '+12% ggue. Vormonat',
      trendColor: '#4caf50',
    },
    {
      title: 'Konversionsrate',
      value: '34%',
      icon: 'trending_up',
      color: '#2196f3',
      trend: '+5% ggue. Vormonat',
      trendColor: '#4caf50',
    },
    {
      title: 'Offene Leads',
      value: '47',
      icon: 'person_add',
      color: '#ff9800',
      trend: '12 neue diese Woche',
      trendColor: '#ff9800',
    },
    {
      title: 'Naechste Termine',
      value: '8',
      icon: 'event',
      color: '#9c27b0',
      trend: '3 heute, 5 diese Woche',
      trendColor: '#666',
    },
  ];
}
