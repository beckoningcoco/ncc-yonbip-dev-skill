# |<<

**患者信息_账户_银行卡关联 (uh_pi_acc_bank / com.yonyou.yh.nhis.pi.patiaccbank.vo.PatiaccbankVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6169.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accbank | 账户与银行卡关联主键 | pk_accbank | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_patiacc | 患者账户 | pk_patiacc | varchar(20) |  | 字符串 (String) |
| 5 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 6 | pk_bankdocuh | 银行 | pk_bankdocuh | varchar(20) |  | 银行(自定义档案) (Defdoc-040005) |
| 7 | bctype | 卡类型 | bctype | int |  | 患者银行卡类型 (patiaccbankEnum) |  | 0=借记卡; |