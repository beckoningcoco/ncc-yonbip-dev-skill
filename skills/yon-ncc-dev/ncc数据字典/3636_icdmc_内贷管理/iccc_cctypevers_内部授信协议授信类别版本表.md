# |<<

**内部授信协议授信类别版本表 (iccc_cctypevers / nc.vo.iccc.innerprotocol.ICCTypeVersVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3022.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version_v | 版本PK | pk_version_v | char(20) | √ | 主键 (UFID) |
| 2 | pk_cctype_i | 主键 | pk_cctype_i | varchar(50) |  | 字符串 (String) |
| 3 | pk_cctypedoc | 授信类别 | pk_cctypedoc | varchar(20) |  | 授信类别 (tmpub_cctype) |
| 4 | ctrlmethod | 控制方式 | ctrlmethod | int |  | 控制方式 (CtrlMethodEnum) |  | 0=控制; |