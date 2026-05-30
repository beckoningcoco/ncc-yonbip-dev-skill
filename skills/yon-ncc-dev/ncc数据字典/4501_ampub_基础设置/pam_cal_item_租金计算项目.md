# |<<

**租金计算项目 (pam_cal_item / nc.vo.am.calculateitem.RentCalItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4232.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cal_item | 租金计算项目主键 | pk_cal_item | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 资产组织最新版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | calitem_code | 计算项编码 | calitem_code | varchar(40) |  | 字符串 (String) |
| 6 | calitem_name | 计算项名称 | calitem_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 7 | func_content | 公式内容 | func_content | varchar(2000) |  | 字符串 (String) |
| 8 | func_ref | 公式设置 | func_ref | varchar(2000) |  | 字符串 (String) |
| 9 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 10 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |