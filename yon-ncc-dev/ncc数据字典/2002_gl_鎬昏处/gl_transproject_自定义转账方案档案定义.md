# |<<

**自定义转账方案档案定义 (gl_transproject / nc.vo.gl.transprodef.transproject)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2493.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transproject | 档案定义标识 | pk_transproject | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | transprojectname | 方案名称 | transprojectname | varchar(50) |  | 字符串 (String) |
| 4 | transprojectcode | 方案编码 | transprojectcode | varchar(50) |  | 字符串 (String) |
| 5 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 6 | pk_accountingbook | 账簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 7 | pk_unit | 业务单元 | pk_unit | char(20) |  | 主键 (UFID) |
| 8 | memo | 备注 | memo | varchar(101) |  | 自定义项 (Custom) |
| 9 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |