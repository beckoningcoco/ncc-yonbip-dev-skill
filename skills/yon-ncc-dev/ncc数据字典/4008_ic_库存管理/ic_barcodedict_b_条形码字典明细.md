# |<<

**条形码字典明细 (ic_barcodedict_b / nc.vo.ic.barcodedict.BarCodeDictBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2882.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbcdictbid | 条码规则字典明细主键 | cbcdictbid | char(20) | √ | 主键 (UFID) |
| 2 | vobjectbody | 业务对象 | vobjectbody | varchar(50) |  | 字符串 (String) |
| 3 | vbarcode | 条码值 | vbarcode | varchar(50) |  | 字符串 (String) |
| 4 | vobjectid | 业务对象主键 | vobjectid | varchar(20) |  | 主键 (UFID) |
| 5 | vbasid | 业务对象基本档案主键 | vbasid | varchar(20) |  | 主键 (UFID) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | vobjectname | 业务对象名称 | vobjectname | varchar(50) |  | 字符串 (String) |