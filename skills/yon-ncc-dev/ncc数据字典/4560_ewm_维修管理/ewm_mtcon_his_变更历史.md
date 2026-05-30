# |<<

**变更历史 (ewm_mtcon_his / nc.vo.ewm.maintaincon.MaintainConHisVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1933.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mtcon_his | 变更历史主键 | pk_mtcon_his | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 维修组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | pk_org_v | 维修组织 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 5 | nversion | 版本号 | nversion | int |  | 整数 (Integer) |
| 6 | pk_changer | 变更人 | pk_changer | varchar(20) |  | 用户 (user) |
| 7 | change_date | 变更日期 | change_date | char(19) |  | 日期 (UFDate) |
| 8 | change_reason | 变更原因 | change_reason | varchar(200) |  | 字符串 (String) |
| 9 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |