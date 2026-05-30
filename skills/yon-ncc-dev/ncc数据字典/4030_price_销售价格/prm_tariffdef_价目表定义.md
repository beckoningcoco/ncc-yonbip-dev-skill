# |<<

**价目表定义 (prm_tariffdef / nc.vo.price.tariff.entity.tariffdef.TariffDefHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4671.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tariffdef | 价目表定义 | pk_tariffdef | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) | √ | 组织_业务单元_销售组织 (salesorg) |
| 4 | vcode | 价目表编码 | vcode | varchar(30) | √ | 字符串 (String) |
| 5 | vname | 价目表名称 | vname | varchar(76) | √ | 多语文本 (MultiLangText) |
| 6 | finvclassflag | 物料分类 | finvclassflag | int |  | 显示方式 (showpattern) | 3 | 1=表头显示; |