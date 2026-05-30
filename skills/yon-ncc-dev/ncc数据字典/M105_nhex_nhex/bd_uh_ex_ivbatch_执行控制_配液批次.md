# |<<

**执行控制_配液批次 (bd_uh_ex_ivbatch / com.yonyou.yh.nhis.ex.sdc.vo.ExIvBatchVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1030.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ivbatch | 主键 | pk_ivbatch | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_dept | 所属部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 5 | batchno | 批次号 | batchno | varchar(50) |  | 字符串 (String) |
| 6 | time_begin | 开始时间 | time_begin | char(8) |  | 时间 (UFTime) |
| 7 | time_end | 结束时间 | time_end | char(8) |  | 时间 (UFTime) |
| 8 | note | 备注 | note | varchar(200) |  | 备注 (Memo) |