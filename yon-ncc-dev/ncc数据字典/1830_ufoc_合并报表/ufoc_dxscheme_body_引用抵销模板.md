# |<<

**引用抵销模板 (ufoc_dxscheme_body / nc.vo.ufoc.dxscheme.DxSchemeSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5876.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dxschemebody | 主键 | pk_dxschemebody | char(20) | √ | 主键 (UFID) |
| 2 | pk_dxrelation | 抵销模板 | pk_dxrelation | varchar(20) |  | 调整及抵销模板 (dxrelation) |
| 3 | pk_difrule | 对账差额规则 | pk_difrule | char(20) |  | 主键 (UFID) |
| 4 | pk_dxscheme | 抵销方案 | pk_dxscheme | varchar(20) |  | 抵销方案 (dxscheme) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | operateorg | 操作组织 | operateorg | varchar(20) |  | 组织 (org) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |