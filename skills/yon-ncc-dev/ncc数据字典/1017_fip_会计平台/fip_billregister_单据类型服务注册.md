# |<<

**单据类型服务注册 (fip_billregister / nc.vo.fip.billregister.BillRegisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2223.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billregister | 对象标识 | pk_billregister | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | modulecode | 模块号 | modulecode | varchar(40) |  | 字符串 (String) |
| 6 | linkqueryclass | 联查实现类 | linkqueryclass | varchar(200) |  | 字符串 (String) |
| 7 | billreflectclass | 单据查询实现类 | billreflectclass | varchar(200) |  | 字符串 (String) |
| 8 | defqueryclass | 自定义查询条件展示类 | defqueryclass | varchar(200) |  | 字符串 (String) |
| 9 | billdrawclass | 拉式实现类 | billdrawclass | varchar(200) |  | 字符串 (String) |
| 10 | drawqueryclass | 拉式生成查询条件展示类 | drawqueryclass | varchar(200) |  | 字符串 (String) |
| 11 | billsumclass | 汇总实现类 | billsumclass | varchar(200) |  | 字符串 (String) |
| 12 | desbillservclass | 目标单据处理实现类 | desbillservclass | varchar(200) |  | 字符串 (String) |
| 13 | desbillsumclass | 单据合并实现类 | desbillsumclass | varchar(200) |  | 字符串 (String) |
| 14 | dessumruleclass | 目标单据合并规则界面 | dessumruleclass | varchar(200) |  | 字符串 (String) |
| 15 | dessumruleref | 合并目标规则参照 | dessumruleref | varchar(200) |  | 字符串 (String) |
| 16 | dessumruleentity | 合并目标规则实体 | dessumruleentity | varchar(200) |  | 字符串 (String) |
| 17 | desctrlruleclass | 目标单据控制条件界面 | desctrlruleclass | varchar(200) |  | 字符串 (String) |
| 18 | editclass | 单据编辑类 | editclass | varchar(200) |  | 字符串 (String) |
| 19 | displayclass | 单据展示类 | displayclass | varchar(200) |  | 字符串 (String) |
| 20 | class_entity_id | 分类要素实体 | class_entity_id | varchar(36) |  | 实体 (entity) |
| 21 | org_entity_id | 主组织实体 | org_entity_id | varchar(36) |  | 实体 (entity) |
| 22 | org_ctrl_entity1 | 主组织的限定实体1 | org_ctrl_entity1 | varchar(36) |  | 实体 (entity) |
| 23 | org_ctrl_entity2 | 主组织的限定实体2 | org_ctrl_entity2 | varchar(36) |  | 实体 (entity) |
| 24 | ctrlorgfindclass | 组织限定实体匹配器 | ctrlorgfindclass | varchar(200) |  | 字符串 (String) |
| 25 | defdoc1 | 关联档案1 | defdoc1 | varchar(50) |  | 字符串 (String) |
| 26 | defdoc2 | 关联档案2 | defdoc2 | varchar(50) |  | 字符串 (String) |
| 27 | defdoc3 | 关联档案3 | defdoc3 | varchar(50) |  | 字符串 (String) |
| 28 | webcomponent | 业务组组件路径 | webcomponent | varchar(200) |  | 字符串 (String) |
| 29 | previewvoucherclass | 凭证预览处理类 | previewvoucherclass | varchar(200) |  | 字符串 (String) |
| 30 | linksrcbillclass | 联查单据处理类 | linksrcbillclass | varchar(200) |  | 字符串 (String) |
| 31 | queryconditionclass | 业务组查询框组件数据处理类 | queryconditionclass | varchar(200) |  | 字符串 (String) |
| 32 | drawquerypanel | 拉式取数内嵌查询组件路径 | drawquerypanel | varchar(50) |  | 字符串 (String) |
| 33 | voucherdataprocessclass | 凭证数据处理类 | voucherdataprocessclass | varchar(50) |  | 字符串 (String) |