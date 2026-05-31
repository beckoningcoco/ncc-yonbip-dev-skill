# |<<

**营销费用归集要素对照设置 (me_facrelset / nc.vo.me.facrelationset.entity.FacRelSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3610.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_facrelset | 营销费用归集要素对照设置 | pk_facrelset | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 利润中心 (profitcenter) |
| 4 | fsrctypeflag | 来源类型 | fsrctypeflag | int |  | 来源类型 (srctypeflag) |  | 1=返利结算; |