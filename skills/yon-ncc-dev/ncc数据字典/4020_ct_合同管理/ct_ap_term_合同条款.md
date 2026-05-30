# |<<

**合同条款 (ct_ap_term / nc.vo.ct.ap.entity.CtApTermVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1650.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_ap_term | 合同条款主键 | pk_ct_ap_term | char(20) | √ | 主键 (UFID) |
| 2 | vtermcode | 条款编码 | vtermcode | varchar(20) |  | 合同条款 (ct_termset) |
| 3 | vtermname | 条款名称 | vtermname | varchar(50) |  | 字符串 (String) |
| 4 | vtermtypename | 条款类型 | vtermtypename | varchar(30) |  | 字符串 (String) |
| 5 | vtermcontent | 条款内容 | vtermcontent | varchar(996) |  | 字符串 (String) |
| 6 | votherinfo | 其它信息 | votherinfo | varchar(256) |  | 字符串 (String) |
| 7 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |
| 8 | pk_org | 公司最新版本 | pk_org | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 9 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | pk_org_v | 公司 | pk_org_v | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |