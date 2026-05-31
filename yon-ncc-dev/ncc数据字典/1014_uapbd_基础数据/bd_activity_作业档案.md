# |<<

**作业档案 (bd_activity / nc.vo.bd.bdactivity.entity.BDActivityVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/322.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cactivityid | 作业档案主键 | cactivityid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | vactivitycode | 作业编码 | vactivitycode | varchar(40) |  | 字符串 (String) |
| 5 | vactivityname | 作业名称 | vactivityname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | vactivitytype | 作业类型 | vactivitytype | varchar(50) |  | 作业类型 (vactivitytype) | 0 | 0=人工; |