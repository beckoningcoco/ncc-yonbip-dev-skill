# |<<

**薪资发放表 (wa_data / nc.vo.wa.paydata.DataVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6328.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_data | 薪资数据表主键 | pk_wa_data | char(20) | √ | 主键 (UFID) |
| 2 | pk_psndoc | 人员基本主键 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 3 | pk_psnjob | 人员任职主键 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 4 | pk_psnorg | 组织关系主键 | pk_psnorg | char(20) |  | 主键 (UFID) |
| 5 | assgid | 任职关系ID | assgid | int |  | 整数 (Integer) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_wa_class | 薪资类别主键 | pk_wa_class | varchar(20) |  | 薪资方案 (WaClassVO) |
| 9 | cyear | 年度 | cyear | char(4) |  | 主键 (UFID) |
| 10 | cperiod | 期间 | cperiod | char(2) |  | 主键 (UFID) |
| 11 | taxtableid | 税率表主键 | taxtableid | varchar(20) |  | 税率表计税基数 (wa_taxbase) |
| 12 | stopflag | 停发标志 | stopflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 13 | caculateflag | 计算标志 | caculateflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 14 | checkflag | 审核标志 | checkflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 15 | partflag | 兼职标志 | partflag | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | pk_bankaccbas1 | 银行账号1 | pk_bankaccbas1 | varchar(40) |  | 字符串 (String) |
| 17 | pk_bankaccbas2 | 银行账号2 | pk_bankaccbas2 | varchar(40) |  | 字符串 (String) |
| 18 | pk_bankaccbas3 | 银行账号3 | pk_bankaccbas3 | varchar(40) |  | 字符串 (String) |
| 19 | pk_banktype1 | 帐号1银行类别 | pk_banktype1 | varchar(20) |  | 银行类别 (banktype) |
| 20 | pk_banktype2 | 帐号2银行类别 | pk_banktype2 | varchar(20) |  | 银行类别 (banktype) |
| 21 | pk_banktype3 | 帐号3银行类别 | pk_banktype3 | varchar(20) |  | 银行类别 (banktype) |
| 22 | isrulehint | 不符合规则是否提示 | isrulehint | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 23 | taxtype | 扣税方式 | taxtype | int |  | 扣税方式 (taxtype) | 0 | 0=代扣税; |