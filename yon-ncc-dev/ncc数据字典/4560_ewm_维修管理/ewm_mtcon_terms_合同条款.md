# |<<

**合同条款 (ewm_mtcon_terms / nc.vo.ewm.maintaincon.MaintainConTermsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1936.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtcon_terms | 合同条款主键 | pk_mtcon_terms | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 维修组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | pk_org_v | 维修组织 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 5 | pk_terms_detail | 合同条款 | pk_terms_detail | varchar(20) |  | 合同条款 (ct_termset) |
| 6 | terms_content | 条款内容 | terms_content | varchar(996) |  | 备注 (Memo) |
| 7 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 8 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 9 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |