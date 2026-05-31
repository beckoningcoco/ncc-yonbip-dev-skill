# |<<

**检查项 (pm_acceptcheck / nc.vo.pmbd.acceptcheck.AcceptCheckVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4402.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_acceptcheck | 检查项主键 | pk_acceptcheck | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | acce_check_code | 检查项编码 | acce_check_code | varchar(200) |  | 字符串 (String) |
| 5 | acce_check_name | 检查项名称 | acce_check_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | pk_acchecktype | 检查项分类 | pk_acchecktype | varchar(20) |  | 检查项分类 (AcceptCheckType) |
| 7 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 8 | enablestate | 启用状态 | enablestate | int |  | 启用状态2(项目管理) (pmEnablestate2) |  | 2=已启用; |