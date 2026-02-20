import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet, RouterLink, RouterLinkActive } from '@angular/router';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatListModule } from '@angular/material/list';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';

import { AuthService } from '../../../core/services/auth.service';

@Component({
  selector: 'app-jarvis-layout',
  standalone: true,
  imports: [
    CommonModule,
    RouterOutlet,
    RouterLink,
    RouterLinkActive,
    MatSidenavModule,
    MatToolbarModule,
    MatListModule,
    MatIconModule,
    MatButtonModule,
  ],
  template: `
    <mat-sidenav-container class="sidenav-container">
      <mat-sidenav mode="side" opened class="sidenav">
        <mat-toolbar color="primary">
          <span>Jarvis</span>
        </mat-toolbar>
        <mat-nav-list>
          <a mat-list-item routerLink="dashboard" routerLinkActive="active-link">
            <mat-icon matListItemIcon>dashboard</mat-icon>
            <span matListItemTitle>Dashboard</span>
          </a>
          <a mat-list-item routerLink="customers" routerLinkActive="active-link">
            <mat-icon matListItemIcon>people</mat-icon>
            <span matListItemTitle>Kunden</span>
          </a>
          <a mat-list-item routerLink="leads" routerLinkActive="active-link">
            <mat-icon matListItemIcon>trending_up</mat-icon>
            <span matListItemTitle>Leads</span>
          </a>
          <a mat-list-item routerLink="contracts" routerLinkActive="active-link">
            <mat-icon matListItemIcon>description</mat-icon>
            <span matListItemTitle>Vertraege</span>
          </a>
          <a mat-list-item routerLink="appointments" routerLinkActive="active-link">
            <mat-icon matListItemIcon>event</mat-icon>
            <span matListItemTitle>Termine</span>
          </a>
          <a mat-list-item routerLink="commissions" routerLinkActive="active-link">
            <mat-icon matListItemIcon>euro_symbol</mat-icon>
            <span matListItemTitle>Provisionen</span>
          </a>
          <a mat-list-item routerLink="consulting" routerLinkActive="active-link">
            <mat-icon matListItemIcon>support_agent</mat-icon>
            <span matListItemTitle>Beratung</span>
          </a>
        </mat-nav-list>
      </mat-sidenav>

      <mat-sidenav-content>
        <mat-toolbar color="primary">
          <span>Jarvis - Vermittlerportal</span>
          <span class="spacer"></span>
          <button mat-icon-button (click)="logout()">
            <mat-icon>logout</mat-icon>
          </button>
        </mat-toolbar>
        <div class="content">
          <router-outlet />
        </div>
      </mat-sidenav-content>
    </mat-sidenav-container>
  `,
  styles: [`
    .sidenav-container {
      height: 100vh;
    }

    .sidenav {
      width: 260px;
    }

    .content {
      padding: 24px;
    }

    .spacer {
      flex: 1 1 auto;
    }

    .active-link {
      background-color: rgba(0, 0, 0, 0.04);
    }
  `],
})
export class JarvisLayoutComponent {
  constructor(private authService: AuthService) {}

  logout(): void {
    this.authService.logout();
  }
}
