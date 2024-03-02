# [2460 Apply Operations to an Array](https://leetcode.com/problems/apply-operations-to-an-array/description/)

## Difficulty: Easy | Topics: Array, Simulation

<hr><div><p>You are given a 0-indexed array <code>nums</code>&nbsp;of size <code>n</code> consisting of <em>non-negative integers</em>.</p>
<p>You need to apply <code>n - 1</code> operations to this array where, in the <code>ith</code> operation (0-indexed), you will apply the following on the ith element of nums:</p>
<p>If <code>nums[i] == nums[i + 1]</code>, then multiply <code>nums[i]</code> by <code>2</code> and set <code>nums[i + 1]</code> to <code>0</code>.</p>
<p>Otherwise, you skip this operation.
After performing all the operations, shift all the <code>0</code>'s to the end of the array.
For example, the array <code>[1,0,2,0,0,1]</code> after shifting all its <code>0</code>'s to the end, is <code>[1,2,1,0,0,0]</code>.</p>
<p>Return the resulting array.
Note that the operations are applied sequentially, not all at once.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre style="position: relative;"><strong>Input:</strong> nums = [1,2,2,1,1,0]
<strong>Output:</strong> [1,4,2,0,0,0]
<strong>Explanation:</strong> We do the following operations:
- i = 0: nums[0] and nums[1] are not equal, so we skip this operation.
- i = 1: nums[1] and nums[2] are equal, we multiply nums[1] by 2 and change nums[2] to 0. The array becomes [1,4,0,1,1,0].
- i = 2: nums[2] and nums[3] are not equal, so we skip this operation.
- i = 3: nums[3] and nums[4] are equal, we multiply nums[3] by 2 and change nums[4] to 0. The array becomes [1,4,0,2,0,0].
- i = 4: nums[4] and nums[5] are equal, we multiply nums[4] by 2 and change nums[5] to 0. The array becomes [1,4,0,2,0,0].
After that, we shift the 0's to the end, which gives the array [1,4,2,0,0,0].
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper"></div></pre>

<p><strong class="example">Example 2:</strong></p>

<pre style="position: relative;"><strong>Input:</strong> nums = [0,1]
<strong>Output:</strong> [1,0]
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper"></div></pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>
<br/>
<ul>
	<li><code>2 <= nums.length <= 2000</li></code>
 <li><code>0 <= nums[i] <= 1000</li></code>
</ul>
