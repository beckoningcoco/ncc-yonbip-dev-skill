# |<<

**价格使用配置 (bd_uh_price_config / com.yonyou.nhis.bd.pub2.price.vo.PriceConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1092.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pricehp | 主键 | pk_pricehp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | eu_pricetype | 价格类型 | eu_pricetype | int |  | 整数 (Integer) |
| 5 | pk_hp | 医保类别 | pk_hp | char(20) |  | 主键 (UFID) |
| 6 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 7 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 9 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |