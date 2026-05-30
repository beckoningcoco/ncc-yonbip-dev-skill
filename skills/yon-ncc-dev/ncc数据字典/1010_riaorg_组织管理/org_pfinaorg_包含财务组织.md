# |<<

**包含财务组织 (org_pfinaorg / nc.vo.profitcenter.Pfinaorg)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4123.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pfinaorg | 包含利润中心组织标识 | pk_pfinaorg | char(20) | √ | 主键 (UFID) |
| 2 | financeorg | 财务组织编码 | financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |