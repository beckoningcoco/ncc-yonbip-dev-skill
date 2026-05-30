# |<<

**工序转移 (mm_transfer / nc.vo.mmsfc.transfer.entity.TransferHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3793.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transfer | 工序转移 | pk_transfer | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | ctrantypeid | 转移单类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | vtrantypecode | 转移单类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 7 | vbillcode | 工序转移单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 8 | fprodmode | 生产模式 | fprodmode | int |  | 生产模式 (prodmode) |  | 1=流程制造; |