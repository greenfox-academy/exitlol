'use strict';


export class Animal {
  protected belly: number = 0;
  protected hungryLevel: number;

  protected constructor(hungryLevel) {
    this.belly = 0;
    this.hungryLevel = hungryLevel;
  }

  public eat(): void {
    this.belly++;
    console.log(this.belly);
  }

  public poop(): boolean {
    if (this.belly > 0) {
      this.belly--;
      return true;
    }
    return false;
  }

  public isHungry() {
    return this.belly < this.hungryLevel;
  }
}