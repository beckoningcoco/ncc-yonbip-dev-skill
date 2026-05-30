# |<<

**WBS模板 (pm_wbstemplet / nc.vo.pmbd.wbstemplet.WbsTempletHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4561.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wbstemplet | WBS任务模板主键 | pk_wbstemplet | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | templet_code | 模板编码 | templet_code | varchar(40) |  | 字符串 (String) |
| 5 | templet_name | 模板名称 | templet_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | enablestate | 启用状态 | enablestate | varchar(50) |  | 启用状态2(项目管理) (pmEnablestate2) |  | 2=已启用; |