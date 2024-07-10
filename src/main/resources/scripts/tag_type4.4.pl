#!/usr/bin/perl
use strict;
use warnings;

my $base_url = 'https://www.onixs.biz/fix-dictionary/4.4/tagNum_';
for my $tag( 1..956) {
  my $url = $base_url."$tag.html";
  my $type = `curl -s $url | grep \"Type:\"`;
  chomp $type;
  $type =~ s/^.*>([^<]+)<\/a><\/p.*/$1/g;
  #<p>Type: <a href="index.html#String">String</a></p>
  print("  $tag: $type\n");
  sleep 1; #to avoid DDoSing
}
