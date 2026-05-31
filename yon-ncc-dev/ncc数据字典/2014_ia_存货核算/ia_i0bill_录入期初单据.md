# |<<

**录入期初单据 (ia_i0bill / nc.vo.ia.mi0.entity.I0HeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2812.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 期初入库单 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 4 | fbookflag | 账簿属性 | fbookflag | int |  | 账簿属性 (fbookflag) |  | 1=财务; |