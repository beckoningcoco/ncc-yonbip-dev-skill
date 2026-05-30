# |<<

**数据接口格式 (hr_dataio_intface / nc.vo.hr.datainterface.HrIntfaceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2666.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dataio_intface | 接口设置表主键 | pk_dataio_intface | char(20) | √ | 主键 (UFID) |
| 2 | pk_bankdoc | 报送银行 | pk_bankdoc | varchar(20) |  | 银行类别 (banktype) |
| 3 | vifname | 接口名称 | vifname | varchar(1024) |  | 多语文本 (MultiLangText) |
| 4 | iiftype | 接口类型 | iiftype | int |  | 接口类型 (ItfTypeEnum) |  | 0=薪资数据; |