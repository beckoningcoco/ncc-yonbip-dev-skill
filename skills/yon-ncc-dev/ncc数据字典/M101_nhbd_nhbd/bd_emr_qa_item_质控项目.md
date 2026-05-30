# |<<

**质控项目 (bd_emr_qa_item / com.yonyou.yh.nhis.bd.qa.vo.EmrQaItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/821.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdemrqaitem | 质控项目主键 | pk_bdemrqaitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | code | 质控项目编码 | code | varchar(20) |  | 字符串 (String) |
| 5 | name | 质控项目名称 | name | varchar(50) |  | 字符串 (String) |
| 6 | eu_qa_method | 质控方式 | eu_qa_method | int |  | 质控方式 (EmrQaMethodEnum) |  | 0=客观; |