# |<<

**薪资标准类别表 (wa_grade / nc.vo.wa.grade.WaGradeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6333.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_grd | 标准类别主键 | pk_wa_grd | char(20) | √ | 主键 (UFID) |
| 2 | code | 标准类别编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 标准类别名称 | name | varchar(1024) |  | 多语文本 (MultiLangText) |
| 4 | ismultsec | 是否为多档 | ismultsec | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | vmemo | 说明 | vmemo | varchar(1024) |  | 备注 (Memo) |
| 6 | pk_wa_item | 薪资项目主键 | pk_wa_item | varchar(20) | √ | 公共薪资项目 (waitem) |
| 7 | isrange | 是否宽带薪酬 | isrange | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 9 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 10 | prmlvcnt | 级别数量 | prmlvcnt | varchar(50) |  | 字符串 (String) |
| 11 | seclvcnt | 档别数量 | seclvcnt | varchar(50) |  | 字符串 (String) |
| 12 | prmlv_money_sort | 级别金额排序方式 | prmlv_money_sort | int |  | 排序方式 (enum) |  | 1=升序排列; |