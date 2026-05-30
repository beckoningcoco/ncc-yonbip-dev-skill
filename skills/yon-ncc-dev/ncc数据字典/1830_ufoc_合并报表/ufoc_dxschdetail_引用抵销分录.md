# |<<

**引用抵销分录 (ufoc_dxschdetail / nc.vo.ufoc.dxscheme.DxschDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5875.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dxschdetail | 主键 | pk_dxschdetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_commvouch | 凭证标识 | pk_commvouch | varchar(20) |  | 常用凭证表头 (常用凭证表头) |
| 3 | pk_dxscheme | 方案标识 | pk_dxscheme | varchar(20) |  | 抵销方案 (dxscheme) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | operateorg | 操作组织 | operateorg | varchar(20) |  | 组织 (org) |
| 7 | unprojectname | 合并报表项目 | unprojectname | varchar(50) |  | 字符串 (String) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |