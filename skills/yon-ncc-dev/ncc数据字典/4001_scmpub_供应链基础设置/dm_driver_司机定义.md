# |<<

**司机定义 (dm_driver / nc.vo.scmf.dm.driver.entity.DriverVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1723.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cdriverid | 司机定义主键 | cdriverid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 物流组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 3 | pk_org_v | 物流组织 | pk_org_v | varchar(20) |  | 组织_业务单元_物流组织版本信息 (trafficorg_v) |
| 4 | vdrivercode | 司机编码 | vdrivercode | varchar(30) |  | 字符串 (String) |
| 5 | vdrivername | 司机名称 | vdrivername | varchar(76) |  | 多语文本 (MultiLangText) |
| 6 | bcarrierflag | 属于承运商 | bcarrierflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | ccarrierid | 所属承运商 | ccarrierid | varchar(20) |  | 承运商定义 (dm_carrier) |
| 8 | fsexflag | 性别 | fsexflag | int |  | 性别 (fsexflag) |  | 1=男; |