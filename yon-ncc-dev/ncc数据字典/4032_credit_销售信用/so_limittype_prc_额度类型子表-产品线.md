# |<<

**额度类型子表-产品线 (so_limittype_prc / nc.vo.credit.limittype.entity.LimitTypePrcVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5411.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | climittypebid | 产品线明细 | climittypebid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 信用控制域 | pk_org | varchar(20) |  | 组织_信用控制域 (creditctlregion) |
| 3 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |