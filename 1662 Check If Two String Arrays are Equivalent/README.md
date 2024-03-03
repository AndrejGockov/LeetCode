# [1662 Check If Two String Arrays are Equivalent](https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/)

## Difficulty: Easy | Topics: Array, String

<hr><div><p>Given two string arrays <code>word1</code> and <code>word2</code>, return <code>true</code> if the two arrays <em>represent</em>he same string, and <code>false</code> otherwise.</p>
<hr><div><p>A string is <strong>represented</strong> by an array if the array elements concatenated <strong>in order</strong> forms the string.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre style="position: relative;"><strong>Input:</strong> word1 = ["ab", "c"], word2 = ["a", "bc"]
<strong>Output:</strong> true
<strong>Explanation:</strong> word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper"></div></pre>

<p><strong class="example">Example 2:</strong></p>

<pre style="position: relative;"><strong>Input:</strong> word1 = ["a", "cb"], word2 = ["ab", "c"]
<strong>Output:</strong> false
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper"></div></pre>

<p><strong class="example">Example 3:</strong></p>

<pre style="position: relative;"><strong>Input:</strong> word1 = ["abc", "d", "defg"], word2 = ["abcddefg"]
<strong>Output:</strong> true
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper"></div></pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>
<br/>
<ul>
	<li><code>1 <= word1.length, word2.length <= 103</code></li>
    <li><code>1 <= word1[i].length, word2[i].length <= 103</code></li>
    <li><code>1 <= sum(word1[i].length), sum(word2[i].length) <= 103</code></li>
    <li><code>word1[i]</code> and <code>word2[i]</code> consist of lowercase letters.</li>
</ul>
