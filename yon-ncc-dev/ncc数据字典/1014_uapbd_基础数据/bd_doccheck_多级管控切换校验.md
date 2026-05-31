# |<<

**多级管控切换校验 (bd_doccheck / nc.vo.bd.doccheck.BDoccheckVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/808.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_doc | 档案主键 | pk_doc | char(20) | √ | 主键 (UFID) |
| 2 | mdid | 引用档案主键 | mdid | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 待分配组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | pk_group | 档案所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | message | 检查结果描述 | message | varchar(50) |  | 字符串 (String) |
| 6 | checktime | 检查时间 | checktime | char(19) |  | 日期 (UFDate) |