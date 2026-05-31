# |<<

**基准折扣定义 (prm_discountdef / nc.vo.price.discount.entity.BaseDiscountDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4656.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_basediscountdef | 基准折扣表定义主键 | pk_basediscountdef | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) | √ | 组织_业务单元_销售组织 (salesorg) |
| 4 | pk_tariffdef | 价目表 | pk_tariffdef | varchar(20) | √ | 价目表定义 (TariffDefHVO) |
| 5 | cbelongsaleorgid | 价目表所属销售组织 | cbelongsaleorgid | varchar(20) | √ | 组织_业务单元_销售组织 (salesorg) |
| 6 | faffectflag | 影响对象 | faffectflag | int | √ | 影响对象 (effectedtarget) |  | 1=影响价格; |