{
  "id": "30504279-9f0d-4628-ba28-9cdb29546b97",
  "version": "2.0",
  "name": "test",
  "url": "https://api.staging.iconjob.co",
  "tests": [{
    "id": "381b80e7-9371-4f71-8b9c-5604c13aeb49",
    "name": "Untitled",
    "commands": [{
      "id": "d83c392a-1fda-459a-9e58-c139ba042e5c",
      "comment": "",
      "command": "open",
      "target": "/admin/login",
      "targets": [],
      "value": ""
    }, {
      "id": "bbf86df8-f8f1-46a8-b002-18a18e076834",
      "comment": "",
      "command": "setWindowSize",
      "target": "550x691",
      "targets": [],
      "value": ""
    }, {
      "id": "824485f7-f9cf-46f0-a3ba-14a8900a78f1",
      "comment": "",
      "command": "type",
      "target": "id=admin_user_email",
      "targets": [
        ["id=admin_user_email", "id"],
        ["name=admin_user[email]", "name"],
        ["css=#admin_user_email", "css:finder"],
        ["xpath=//input[@id='admin_user_email']", "xpath:attributes"],
        ["xpath=//li[@id='admin_user_email_input']/input", "xpath:idRelative"],
        ["xpath=//li/input", "xpath:position"]
      ],
      "value": "chuprikov@worki.ru"
    }, {
      "id": "007ed9d5-58f5-4be4-a52d-df0e3654682b",
      "comment": "",
      "command": "type",
      "target": "id=admin_user_password",
      "targets": [
        ["id=admin_user_password", "id"],
        ["name=admin_user[password]", "name"],
        ["css=#admin_user_password", "css:finder"],
        ["xpath=//input[@id='admin_user_password']", "xpath:attributes"],
        ["xpath=//li[@id='admin_user_password_input']/input", "xpath:idRelative"],
        ["xpath=//li[2]/input", "xpath:position"]
      ],
      "value": "123456"
    }, {
      "id": "16f8565f-8589-4e51-b7bb-1c8d699edd1c",
      "comment": "",
      "command": "click",
      "target": "id=admin_user_remember_me",
      "targets": [
        ["id=admin_user_remember_me", "id"],
        ["css=#admin_user_remember_me", "css:finder"],
        ["xpath=//input[@id='admin_user_remember_me']", "xpath:attributes"],
        ["xpath=//li[@id='admin_user_remember_me_input']/label/input", "xpath:idRelative"],
        ["xpath=//label/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "48e62cf7-6192-43e4-a532-99dba3fa2d09",
      "comment": "",
      "command": "click",
      "target": "name=commit",
      "targets": [
        ["name=commit", "name"],
        ["css=#admin_user_submit_action > input", "css:finder"],
        ["xpath=//input[@name='commit']", "xpath:attributes"],
        ["xpath=//li[@id='admin_user_submit_action']/input", "xpath:idRelative"],
        ["xpath=//fieldset[2]/ol/li/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "cd3c16e2-d31d-4eb8-b041-84b95336c5d9",
      "comment": "",
      "command": "click",
      "target": "linkText=Работодатели",
      "targets": [
        ["linkText=Работодатели", "linkText"],
        ["css=#recruiters > a", "css:finder"],
        ["xpath=//a[contains(text(),'Работодатели')]", "xpath:link"],
        ["xpath=//li[@id='recruiters']/a", "xpath:idRelative"],
        ["xpath=//a[contains(@href, '/admin/recruiters')]", "xpath:href"],
        ["xpath=//li[49]/a", "xpath:position"],
        ["xpath=//a[contains(.,'Работодатели')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "dce0ba86-4857-47f9-babb-90b6038ccf08",
      "comment": "",
      "command": "click",
      "target": "linkText=4309",
      "targets": [
        ["linkText=4309", "linkText"],
        ["css=#user_4309 .resource_id_link", "css:finder"],
        ["xpath=//a[contains(text(),'4309')]", "xpath:link"],
        ["xpath=//tr[@id='user_4309']/td[2]/a", "xpath:idRelative"],
        ["xpath=//a[contains(@href, '/admin/recruiters/4309')]", "xpath:href"],
        ["xpath=//tr[18]/td[2]/a", "xpath:position"],
        ["xpath=//a[contains(.,'4309')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "35ecd587-c1c2-4516-bcac-15a919f69200",
      "comment": "",
      "command": "mouseDown",
      "target": "css=.row-banned > td",
      "targets": [
        ["css=.row-banned > td", "css:finder"],
        ["xpath=//div[@id='attributes_table_user_4309']/table/tbody/tr[2]/td", "xpath:idRelative"],
        ["xpath=//tr[2]/td", "xpath:position"],
        ["xpath=//td[contains(.,'Забанить')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "43f5648f-b7b0-4e4d-89db-6fc763e1a390",
      "comment": "",
      "command": "mouseUp",
      "target": "id=attributes_table_user_4309",
      "targets": [
        ["id=attributes_table_user_4309", "id"],
        ["css=#attributes_table_user_4309", "css:finder"],
        ["xpath=//div[@id='attributes_table_user_4309']", "xpath:attributes"],
        ["xpath=//div[@id='main_content']/div/div/div", "xpath:idRelative"],
        ["xpath=//div[4]/div/div/div/div/div", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "385c31a2-ad7e-49cb-9b38-168ad5cab64c",
      "comment": "",
      "command": "click",
      "target": "id=attributes_table_user_4309",
      "targets": [
        ["id=attributes_table_user_4309", "id"],
        ["css=#attributes_table_user_4309", "css:finder"],
        ["xpath=//div[@id='attributes_table_user_4309']", "xpath:attributes"],
        ["xpath=//div[@id='main_content']/div/div/div", "xpath:idRelative"],
        ["xpath=//div[4]/div/div/div/div/div", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "ccbfa512-edf8-42f7-8c0c-4cc03a440b1f",
      "comment": "",
      "command": "click",
      "target": "linkText=Изменить Работодатель",
      "targets": [
        ["linkText=Изменить Работодатель", "linkText"],
        ["css=.action_item:nth-child(1) > a", "css:finder"],
        ["xpath=//a[contains(text(),'Изменить Работодатель')]", "xpath:link"],
        ["xpath=//div[@id='titlebar_right']/div/span/a", "xpath:idRelative"],
        ["xpath=//a[contains(@href, '/admin/recruiters/4309/edit')]", "xpath:href"],
        ["xpath=//div[2]/div[2]/div/span/a", "xpath:position"],
        ["xpath=//a[contains(.,'Изменить Работодатель')]", "xpath:innerText"]
      ],
      "value": ""
    }, {
      "id": "e8769af0-94c8-46a8-8de3-4fb8aa9443f5",
      "comment": "",
      "command": "click",
      "target": "id=user_first_name",
      "targets": [
        ["id=user_first_name", "id"],
        ["name=user[first_name]", "name"],
        ["css=#user_first_name", "css:finder"],
        ["xpath=//input[@id='user_first_name']", "xpath:attributes"],
        ["xpath=//li[@id='user_first_name_input']/input", "xpath:idRelative"],
        ["xpath=//li/input", "xpath:position"]
      ],
      "value": ""
    }, {
      "id": "936cef3f-274f-4e27-b3d0-f03ef83f5c98",
      "comment": "",
      "command": "type",
      "target": "id=user_first_name",
      "targets": [
        ["id=user_first_name", "id"],
        ["name=user[first_name]", "name"],
        ["css=#user_first_name", "css:finder"],
        ["xpath=//input[@id='user_first_name']", "xpath:attributes"],
        ["xpath=//li[@id='user_first_name_input']/input", "xpath:idRelative"],
        ["xpath=//li/input", "xpath:position"]
      ],
      "value": "Чупh"
    }, {
      "id": "41e08ddf-bee0-4749-a6cb-eae99d0ccde1",
      "comment": "",
      "command": "click",
      "target": "name=commit",
      "targets": [
        ["name=commit", "name"],
        ["css=#user_submit_action > input", "css:finder"],
        ["xpath=//input[@name='commit']", "xpath:attributes"],
        ["xpath=//li[@id='user_submit_action']/input", "xpath:idRelative"],
        ["xpath=//fieldset[2]/ol/li/input", "xpath:position"]
      ],
      "value": ""
    }]
  }],
  "suites": [{
    "id": "459f5f27-52f6-4416-8636-cd319f6c9e83",
    "name": "Default Suite",
    "persistSession": false,
    "parallel": false,
    "timeout": 300,
    "tests": ["381b80e7-9371-4f71-8b9c-5604c13aeb49"]
  }],
  "urls": ["https://api.staging.iconjob.co/"],
  "plugins": []
}