# |<<

**子基金退出 (ipmfund_fundexit / nc.vo.ipmfund.fundexit.FundExitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3305.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_exit | 子基金退出主键 | pk_exit | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 6 | pk_fundlib | 基金编号 | pk_fundlib | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 7 | vfundname | 基金名称 | vfundname | varchar(200) |  | 字符串 (String) |
| 8 | pk_fundlib_child | 子基金名称 | pk_fundlib_child | varchar(20) |  | 基金库 (IPMFundLibVO) |
| 9 | vexitstatus | 退出状态 | vexitstatus | varchar(50) |  | 退出状态 (FundExitStatus) |  | 1=部分退出; |