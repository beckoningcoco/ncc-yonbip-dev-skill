# |<<

**授信执行明细表 (iccc_execdetail / nc.vo.iccc.execdetail.ExecDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3023.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_execdetail_i | 执行明细主键 | pk_execdetail_i | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 单据编号 | vbillno | varchar(40) |  | 字符串 (String) |
| 3 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 4 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | pk_srcbill | 来源单据主键 | pk_srcbill | varchar(20) |  | 字符串 (String) |
| 6 | pk_srcbill_b | 来源单据表体主键 | pk_srcbill_b | varchar(20) |  | 字符串 (String) |
| 7 | sourcesystem | 业务系统 | sourcesystem | varchar(20) |  | 模块信息 (module) |
| 8 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | pk_quotaorg | 受信单位 | pk_quotaorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 10 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 11 | pk_quotaorg_v | 受信单位版本 | pk_quotaorg_v | char(20) |  | 字符串 (String) |
| 12 | pk_org_v | 主组织版本 | pk_org_v | char(20) |  | 字符串 (String) |
| 13 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 14 | remark | 备注 | remark | varchar(181) |  | 字符串 (String) |
| 15 | pk_incprotocol | 授信协议 | pk_incprotocol | varchar(20) |  | 内部授信协议 (InnerProtocolVO) |
| 16 | pk_cctype | 授信类别 | pk_cctype | varchar(20) |  | 内部授信类别 (icctype) |
| 17 | updatedir | 业务操作 | updatedir | varchar(50) |  | 回写方向 (UpdateDirEnum) |  | USE=占用; |