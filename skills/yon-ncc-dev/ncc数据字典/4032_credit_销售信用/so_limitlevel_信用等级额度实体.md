# |<<

**信用等级额度实体 (so_limitlevel / nc.vo.credit.limitlevel.entity.LimitLevelVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5407.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | climitlevelid | 信用等级额度主键 | climitlevelid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 信用控制域 | pk_org | varchar(20) |  | 组织_信用控制域 (creditctlregion) |
| 3 | climittypeid | 额度类型 | climittypeid | varchar(20) |  | 额度类型表 (so_limittype) |
| 4 | ccreditlevelid | 信用等级 | ccreditlevelid | varchar(20) |  | 信用等级(自定义档案) (Defdoc-BD003_0xx) |
| 5 | ccurrencyid | 币种 | ccurrencyid | varchar(20) |  | 币种 (currtype) |
| 6 | nlimitmny | 信用额度 | nlimitmny | number(28, 8) |  | 数值 (UFDouble) |
| 7 | dfromdate | 有效期从 | dfromdate | char(19) |  | 日期时间 (UFDateTime) |
| 8 | dtodate | 有效期至 | dtodate | char(19) |  | 日期时间 (UFDateTime) |
| 9 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |