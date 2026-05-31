# |<<

**委托管理协议 (ipmfund_entrust_proto / nc.vo.ipmfund.entrustproto.EntrustProto)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3299.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_entrust_proto | 委托管理协议主键 | pk_entrust_proto | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_dept | 记录部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_v | 记录部门版本 | pk_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 7 | pk_psndoc | 经办人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 8 | vbillcode | 协议编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 9 | proto_code | 编号 | proto_code | varchar(50) |  | 字符串 (String) |
| 10 | proto_name | 协议名称 | proto_name | varchar(200) |  | 字符串 (String) |
| 11 | fund_name | 基金名称 | fund_name | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 12 | pk_fundtype | 基金类型 | pk_fundtype | varchar(20) |  | 基金类型 (FundTypeVO) |
| 13 | dfounddate | 成立时间 | dfounddate | char(19) |  | 日期 (UFDate) |
| 14 | pk_org_form | 组织形式 | pk_org_form | varchar(20) |  | 基金组织形式 (FundFormVO) |
| 15 | nalltargetpaymny | 基金规模全局本币(元) | nalltargetpaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | ngptargetpaymny | 基金规模集团本币(元) | ngptargetpaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | nbasetargetpaymny | 基金规模组织本币(元) | nbasetargetpaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | norigtargetpaymny | 基金规模(元) | norigtargetpaymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | proto_state | 协议生效状态 | proto_state | varchar(50) |  | 协议生效状态 (ProtoStatusEnum) |  | 1=未生效; |