# |<<

**用户审计选项记录 (bd_Auditdef / nc.vo.bd.audit.AuditdefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/338.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_auditdef | pk_auditdef | pk_auditdef | char(20) | √ | 主键 (UFID) |
| 2 | pk_bdinfo | 自定义档案 | pk_bdinfo | image |  | BLOB (BLOB) |
| 3 | pk_corp | 组织 | pk_corp | image |  | BLOB (BLOB) |
| 4 | pk_glorgbook | 总账 | pk_glorgbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 5 | exportpath | 输出路径 | exportpath | varchar(255) |  | 字符串 (String) |
| 6 | fasubj | 固定资产会计科目 | fasubj | varchar(50) |  | 字符串 (String) |
| 7 | sumdepsubj | 累计折旧会计科目 | sumdepsubj | varchar(50) |  | 字符串 (String) |
| 8 | predevsubj | 减值准备会计科目 | predevsubj | varchar(50) |  | 字符串 (String) |
| 9 | reporttext | 报表 | reporttext | varchar(50) |  | 字符串 (String) |
| 10 | endmonth | 结束月份 | endmonth | varchar(50) |  | 字符串 (String) |
| 11 | startmonth | 开始月份 | startmonth | varchar(50) |  | 字符串 (String) |
| 12 | year | 会计年度 | year | varchar(50) |  | 字符串 (String) |
| 13 | arsubj | 应收会计科目 | arsubj | varchar(50) |  | 字符串 (String) |
| 14 | apsubj | 应付会计科目 | apsubj | varchar(50) |  | 字符串 (String) |
| 15 | waitems | 薪资项目 | waitems | varchar(50) |  | 字符串 (String) |
| 16 | auditmodules | 审计模块 | auditmodules | varchar(255) |  | 字符串 (String) |
| 17 | cuserid | 用户 | cuserid | varchar(20) |  | 用户 (user) |
| 18 | reportobj | 报表参数 | reportobj | image |  | BLOB (BLOB) |
| 19 | reporttextnew | 报表显示内容 | reporttextnew | image |  | BLOB (BLOB) |
| 20 | pk_waitems | 薪资福利 | pk_waitems | image |  | BLOB (BLOB) |