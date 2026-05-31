# |<<

**辅助信息基本信息 (xx_xsysregister / nc.vo.pfxx.auxiliary.XsysregisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6391.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_xsysregister | 辅助信息主键 | pk_xsysregister | char(20) | √ | 主键 (UFID) |
| 2 | exsystem | 外部系统 | exsystem | varchar(20) | √ | 外部系统信息 (exsystem) |
| 3 | billtypecode | 单据类型 | billtypecode | varchar(20) | √ | 单据类型 (BilltypeVO) |
| 4 | receiver | 接收组织 | receiver | varchar(20) | √ | 组织 (org) |
| 5 | iseditable | 是否可编辑 | iseditable | char(1) |  | 布尔类型 (UFBoolean) |