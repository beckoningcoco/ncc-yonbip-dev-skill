# |<<

**价目表引用价格项 (prm_tariffrefitem / nc.vo.price.tariff.entity.tariffdef.TariffDefBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4672.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tariffpricetype | 价格表引用价格项 | pk_tariffpricetype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) | √ | 组织_业务单元_销售组织 (salesorg) |
| 4 | pk_pricetype | 价格项 | pk_pricetype | varchar(20) |  | 价格项 (prm_pricetype) |
| 5 | busedflag | 是否适用价格项 | busedflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | bcanmodifyflag | 价格是否可维护 | bcanmodifyflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | iindex | 位置 | iindex | int |  | 整数 (Integer) |
| 8 | vpricekey | 价格项字段名 | vpricekey | varchar(10) |  | 字符串 (String) |
| 9 | loadformula | 执行公式 | loadformula | varchar(1000) |  | 字符串 (String) |
| 10 | validateformula | 验证公式 | validateformula | varchar(1000) |  | 字符串 (String) |