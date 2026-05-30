# |<<

**发票管理 (un_bl_inv_mana / nc.vo.nhbl.inv.BlInvManaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6302.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ivnmana | 发票管理主键 | pk_ivnmana | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_psn_inv | 操作员 | pk_psn_inv | char(20) |  | 主键 (UFID) |
| 5 | name_psn_inv | 操作员名称 | name_psn_inv | varchar(50) |  | 字符串 (String) |
| 6 | code_book | 号段编码 | code_book | varchar(30) |  | 字符串 (String) |
| 7 | invno_begin | 发票开始号码 | invno_begin | varchar(30) |  | 字符串 (String) |
| 8 | invno_end | 发票结束号码 | invno_end | varchar(30) |  | 字符串 (String) |
| 9 | invno_cur | 当前使用发票号 | invno_cur | varchar(30) |  | 字符串 (String) |
| 10 | flag_active | 启动标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | eu_status | 号段状态 | eu_status | int |  | 发票号段状态 (invstatus) |  | 0=领取; |