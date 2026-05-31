# |<<

**自定义转账方案定义 (gl_transprodef / nc.vo.gl.transprodef.transprodef)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2492.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transprodef | 方案定义标识 | pk_transprodef | char(20) | √ | 自定义转账定义主体 (transfer) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | exeno | 结转序号 | exeno | int |  | 整数 (Integer) |
| 4 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 5 | pk_transproject | 自定义转账方案档案定义pk | pk_transproject | char(20) |  | 主键 (UFID) |
| 6 | pk_transfer | 自定义转账pk | pk_transfer | char(20) |  | 主键 (UFID) |
| 7 | pk_unit | 业务单元 | pk_unit | char(20) |  | 主键 (UFID) |
| 8 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |