# |<<

**编制维度子表 (hrp_dimensiondef / nc.vo.hrp.budgetdimension.DimensionDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2738.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dimensiondef | 维度子表主键 | pk_dimensiondef | char(20) | √ | 主键 (UFID) |
| 2 | pk_dimension | 编制维度主键 | pk_dimension | char(20) |  | 主键 (UFID) |
| 3 | stat_condition_sql | 条件定义sql | stat_condition_sql | varchar(3000) |  | 字符串 (String) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_dimdefdoc | 编制维度定义档案主键 | pk_dimdefdoc | varchar(20) |  | 编制维度档案子表 (DimensionDefDocVO) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |