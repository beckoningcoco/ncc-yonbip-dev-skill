# |<<

**转账分类定义 (gl_transfersort / nc.vo.gl.transferSort.transfersort)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2490.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transsort | 主键 | pk_transsort | char(20) | √ | 主键 (UFID) |
| 2 | transcode | 分类编码 | transcode | varchar(50) |  | 字符串 (String) |
| 3 | transname | 分类名称 | transname | varchar(50) |  | 字符串 (String) |
| 4 | pk_upertrans | 上级方案 | pk_upertrans | char(20) |  | 主键 (UFID) |
| 5 | pk_group | 集团 | pk_group | char(20) |  | 主键 (UFID) |
| 6 | pk_glbook | 帐簿 | pk_glbook | char(20) |  | 主键 (UFID) |
| 7 | pk_org | 主体 | pk_org | char(20) |  | 主键 (UFID) |
| 8 | pk_accountingbook | 核算账簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 9 | pk_unit | 业务单元 | pk_unit | char(20) |  | 主键 (UFID) |
| 10 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |